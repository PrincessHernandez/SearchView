# Android SearchView

## Table of Contents
1. [Introduction](#introduction)
	* [Methods](#methods)
2. [History](#history)
3. [Example](#example)
4. [References](#references)

### Introduction
SearchView is a search widget that provides a user interface to direct search for a specific query to submit a request over a search provider. The app developer provides SearchView for a good in-app user search experience to serve user base. It is similar to a search box in HTML.

#### Methods
1. `public boolean onQueryTextSubmit(String query)` It looks through the query on the submission of the content. It is case dependent.
2. `public boolean onQueryTextChange(String newText)` It looks through the query at the time of text change.

### History
SearchView was first added to Android 3.0 API 11 for material design.

### Example
For a project sample of SearchView click [here](https://github.com/PrincessHernandez/SearchView/tree/master/Code).
<br/> You will see in this project of SearchView over layout that reaches data in a ListView.

### References
https://developer.android.com/reference/android/widget/SearchView
