/*
 * Copyright 2015-2017 Hewlett Packard Enterprise Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query.params;

/**
 * Parameters for Content
 */
public enum QueryParams {
    AbsWeight,
    AgentBooleanField,
    AgentParamsField,
    AgentSecurityField,
    AnyLanguage,
    AutoPhrase,
    CaseSensitive,
    Characters,
    Cluster,
    ClusterThreshold,
    ClusterTitleLength,
    Combine,
    CombineNumber,
    DAHEndState,
    DAHStartState,
    DatabaseMatch,
    DetectLanguageType,
    DontMatchID,
    DontMatchReference,
    EndTag,
    FieldCheck,
    FieldRecurse,
    FieldRestriction,
    FieldText,
    FieldTextField,
    HardFieldRestriction,
    Highlight,
    HighlightTagTerm,
    IgnoreSpecials,
    IRS,
    LanguageType,
    LinkFieldText,
    MatchAllTerms,
    MatchEncoding,
    MatchID,
    MatchLanguage,
    MatchLanguageType,
    MatchReference,
    MaxDate,
    MaxID,
    MaxLinksPerTerm,
    MaxPrintChars,
    MaxQueryTerms,
    MaxResults,
    MaxScore,
    MinDate,
    MinLinks,
    MinScore,
    MinTermLength,
    MultiStage,
    MultiStageInfo,
    MultiStageMinResults,
    MultiStagePageBackward,
    MultiStageStartState,
    MultiStageTotalStages,
    OutputEncoding,
    PerformanceAnalysis,
    Predict,
    Print,
    PrintFields,
    QuerySummary,
    QuerySummaryAdvanced,
    QuerySummaryIDs,
    QuerySummaryLength,
    QuerySummaryMaxDocLength,
    QuerySummaryNumbers,
    QuerySummaryPhraseLength,
    QuerySummaryPlus,
    QuerySummaryStopPhraseMode,
    QuerySummaryTerms,
    QuerySummaryWhiteListMode,
    ReferenceField,
    SecurityInfo,
    Sentences,
    ShowReasons,
    SingleMatch,
    Sort,
    SpellCheck,
    Start,
    StartTag,
    StateDontMatchID,
    StateMatchID,
    Stemming,
    StoredStateDetail,
    StoredStateField,
    StoredStateTokenLifetime,
    StoreState,
    Summary,
    Synchronous,
    Synonym,
    Text,
    TextParse,
    TimeoutMS,
    TotalResults,
    UserMetaFields,
    VQL,
    WeighFieldText,
    XMLMeta;

    public static QueryParams fromValue(final String value) {
        for(final QueryParams queryParam : values()) {
            if(queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
