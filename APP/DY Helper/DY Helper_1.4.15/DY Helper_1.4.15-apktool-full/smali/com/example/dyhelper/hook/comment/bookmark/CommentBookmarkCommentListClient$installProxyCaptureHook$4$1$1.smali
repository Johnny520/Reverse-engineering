.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->installProxyCaptureHook(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $interfaceMethod:Ljava/lang/reflect/Method;

.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lk01;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->access$getSelfInvoking$p()Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$selfInvoking$1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_1
    array-length v0, p1

    .line 29
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    array-length v1, v1

    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_2
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->access$getLoadMoreParamNames$p()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->resolveParamNames(Ljava/lang/reflect/Method;Ljava/util/List;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const-string v1, "aweme_id"

    .line 53
    .line 54
    invoke-interface {v6, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const-string v2, "insert_ids"

    .line 59
    .line 60
    invoke-interface {v6, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-static {v1, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    instance-of v3, v1, Ljava/lang/String;

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    move-object v1, v9

    .line 77
    :goto_0
    invoke-static {v2, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    instance-of v3, v2, Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    check-cast v2, Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object v2, v9

    .line 89
    :goto_1
    if-eqz v1, :cond_6

    .line 90
    .line 91
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;

    .line 99
    .line 100
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {p1}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    invoke-direct/range {v3 .. v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V

    .line 115
    .line 116
    .line 117
    invoke-static {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->access$setCapturedProfile$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$CapturedLoadMoreProfile;)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->access$getLastCaptureLogAt$p()J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    sub-long v5, v3, v5

    .line 129
    .line 130
    const-wide/16 v7, 0x7530

    .line 131
    .line 132
    cmp-long p1, v5, v7

    .line 133
    .line 134
    if-lez p1, :cond_6

    .line 135
    .line 136
    invoke-static {v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->access$setLastCaptureLogAt$p(J)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1;->$interfaceMethod:Ljava/lang/reflect/Method;

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    const-string v0, "#"

    .line 156
    .line 157
    const-string v3, ", awemeId="

    .line 158
    .line 159
    const-string v4, "captured host comment list request, method="

    .line 160
    .line 161
    invoke-static {v4, p1, v0, p0, v3}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    const-string p1, ", insertIds="

    .line 166
    .line 167
    invoke-static {p0, v1, p1, v2}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const/4 p1, 0x4

    .line 172
    const-string v0, "r20776a48cef66734"

    .line 173
    .line 174
    invoke-static {v0, p0, v9, p1, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_6
    :goto_2
    return-void
.end method
