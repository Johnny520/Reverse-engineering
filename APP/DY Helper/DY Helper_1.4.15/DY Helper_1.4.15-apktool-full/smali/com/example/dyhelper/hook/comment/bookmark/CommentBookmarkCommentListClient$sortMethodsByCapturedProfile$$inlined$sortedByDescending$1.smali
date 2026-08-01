.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->sortMethodsByCapturedProfile(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation


# instance fields
.field final synthetic $profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "fetchCommentListV2Post"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x2710

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v3

    .line 21
    :goto_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "fetchCommentListV2Stream"

    .line 26
    .line 27
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    add-int/lit16 v0, v0, -0x2710

    .line 34
    .line 35
    :cond_1
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 36
    .line 37
    const-string v6, "#fetchCommentListV2Stream("

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getMethodKey()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v4, v6, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 52
    .line 53
    invoke-virtual {v4, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 58
    .line 59
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getMethodKey()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {p2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    add-int/lit16 v0, v0, 0x4e20

    .line 70
    .line 71
    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p1, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move v2, v3

    .line 89
    :goto_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    add-int/lit16 v2, v2, -0x2710

    .line 100
    .line 101
    :cond_4
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getMethodKey()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0, v6, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;->getMethodKey()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_5

    .line 132
    .line 133
    add-int/lit16 v2, v2, 0x4e20

    .line 134
    .line 135
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    return p0
.end method
