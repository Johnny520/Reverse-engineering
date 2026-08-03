.class public LYue/ۥۡۧۢۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۢۧ$ۥ۟۟۟;,
        LYue/ۥۡۧۢۧ$ۥ;,
        LYue/ۥۡۧۢۧ$ۥ۟;,
        LYue/ۥۡۧۢۧ$ۥ۟۟;,
        LYue/ۥۡۧۢۧ$ۥ۟۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟۠:Ljava/lang/String; = ":all"


# instance fields
.field public final ۥ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df\u06df\u06df;",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5;",
            ">;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df\u06df\u06df;",
            "Ljava/util/Map<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5;",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df;",
            ">;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df\u06df\u06df;",
            "Ljava/util/Map<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5;",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df\u06df;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟۟:Z

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۧۢۧ;)V
    .locals 7

    .line 7
    invoke-direct {p0}, LYue/ۥۡۧۢۧ;-><init>()V

    .line 8
    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    iget-object v1, p1, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    iget-object v0, p1, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 10
    iget-object v2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    new-instance v4, Ljava/util/HashSet;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p1, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 12
    iget-object v2, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    new-instance v4, Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {v4, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 13
    :cond_1
    iget-object v0, p1, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 14
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 15
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 16
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥۡۧۢۧ$ۥ;

    new-instance v6, Ljava/util/HashSet;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v6, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 17
    :cond_2
    iget-object v3, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 18
    :cond_3
    iget-boolean p1, p1, LYue/ۥۡۧۢۧ;->ۥ۟۟۟۟:Z

    iput-boolean p1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟۟:Z

    return-void
.end method

.method public static ۥ۟۟۟۟()LYue/ۥۡۧۢۧ;
    .locals 25

    new-instance v0, LYue/ۥۡۧۢۧ;

    invoke-direct {v0}, LYue/ۥۡۧۢۧ;-><init>()V

    const-string v23, "u"

    const-string v24, "ul"

    const-string v1, "a"

    const-string v2, "b"

    const-string v3, "blockquote"

    const-string v4, "br"

    const-string v5, "cite"

    const-string v6, "code"

    const-string v7, "dd"

    const-string v8, "dl"

    const-string v9, "dt"

    const-string v10, "em"

    const-string v11, "i"

    const-string v12, "li"

    const-string v13, "ol"

    const-string v14, "p"

    const-string v15, "pre"

    const-string v16, "q"

    const-string v17, "small"

    const-string v18, "span"

    const-string v19, "strike"

    const-string v20, "strong"

    const-string v21, "sub"

    const-string v22, "sup"

    filled-new-array/range {v1 .. v24}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟([Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v1, "href"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "a"

    invoke-virtual {v0, v3, v2}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v2, "cite"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "blockquote"

    invoke-virtual {v0, v5, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "q"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v4, v6}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "mailto"

    const-string v6, "ftp"

    const-string v7, "http"

    const-string v8, "https"

    filled-new-array {v6, v7, v8, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v1, v4}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v2, v1}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v2, v1}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v1, "rel"

    const-string v2, "nofollow"

    invoke-virtual {v0, v3, v1, v2}, LYue/ۥۡۧۢۧ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟۠()LYue/ۥۡۧۢۧ;
    .locals 8

    invoke-static {}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟۟()LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v1, "img"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟([Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v6, "title"

    const-string v7, "width"

    const-string v2, "align"

    const-string v3, "alt"

    const-string v4, "height"

    const-string v5, "src"

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v2, "http"

    const-string v3, "https"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "src"

    invoke-virtual {v0, v1, v3, v2}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟ۥ()LYue/ۥۡۧۢۧ;
    .locals 1

    new-instance v0, LYue/ۥۡۧۢۧ;

    invoke-direct {v0}, LYue/ۥۡۧۢۧ;-><init>()V

    return-object v0
.end method

.method public static ۥ۟۟۟ۧ()LYue/ۥۡۧۢۧ;
    .locals 43

    new-instance v0, LYue/ۥۡۧۢۧ;

    invoke-direct {v0}, LYue/ۥۡۧۢۧ;-><init>()V

    const-string v41, "u"

    const-string v42, "ul"

    const-string v1, "a"

    const-string v2, "b"

    const-string v3, "blockquote"

    const-string v4, "br"

    const-string v5, "caption"

    const-string v6, "cite"

    const-string v7, "code"

    const-string v8, "col"

    const-string v9, "colgroup"

    const-string v10, "dd"

    const-string v11, "div"

    const-string v12, "dl"

    const-string v13, "dt"

    const-string v14, "em"

    const-string v15, "h1"

    const-string v16, "h2"

    const-string v17, "h3"

    const-string v18, "h4"

    const-string v19, "h5"

    const-string v20, "h6"

    const-string v21, "i"

    const-string v22, "img"

    const-string v23, "li"

    const-string v24, "ol"

    const-string v25, "p"

    const-string v26, "pre"

    const-string v27, "q"

    const-string v28, "small"

    const-string v29, "span"

    const-string v30, "strike"

    const-string v31, "strong"

    const-string v32, "sub"

    const-string v33, "sup"

    const-string v34, "table"

    const-string v35, "tbody"

    const-string v36, "td"

    const-string v37, "tfoot"

    const-string v38, "th"

    const-string v39, "thead"

    const-string v40, "tr"

    filled-new-array/range {v1 .. v42}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟([Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v1, "title"

    const-string v2, "href"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v3, "a"

    invoke-virtual {v0, v3, v1}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v1, "cite"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "blockquote"

    invoke-virtual {v0, v5, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "span"

    const-string v6, "width"

    filled-new-array {v4, v6}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "col"

    invoke-virtual {v0, v8, v7}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v7, "colgroup"

    filled-new-array {v4, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v7, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v11, "title"

    const-string v12, "width"

    const-string v7, "align"

    const-string v8, "alt"

    const-string v9, "height"

    const-string v10, "src"

    filled-new-array/range {v7 .. v12}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, "img"

    invoke-virtual {v0, v7, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "start"

    const-string v8, "type"

    filled-new-array {v4, v8}, [Ljava/lang/String;

    move-result-object v4

    const-string v9, "ol"

    invoke-virtual {v0, v9, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v4

    const-string v9, "q"

    invoke-virtual {v0, v9, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "summary"

    filled-new-array {v4, v6}, [Ljava/lang/String;

    move-result-object v4

    const-string v10, "table"

    invoke-virtual {v0, v10, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "colspan"

    const-string v10, "rowspan"

    const-string v11, "abbr"

    const-string v12, "axis"

    filled-new-array {v11, v12, v4, v10, v6}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, "td"

    invoke-virtual {v0, v6, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v14, "scope"

    const-string v15, "width"

    const-string v10, "abbr"

    const-string v11, "axis"

    const-string v12, "colspan"

    const-string v13, "rowspan"

    filled-new-array/range {v10 .. v15}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, "th"

    invoke-virtual {v0, v6, v4}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "ul"

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v4, v6}, LYue/ۥۡۧۢۧ;->ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v4, "mailto"

    const-string v6, "ftp"

    const-string v8, "http"

    const-string v10, "https"

    filled-new-array {v6, v8, v10, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v4}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v1, v2}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v1, v2}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    const-string v2, "src"

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v7, v2, v3}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v9, v1, v2}, LYue/ۥۡۧۢۧ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۠ۡ()LYue/ۥۡۧۢۧ;
    .locals 6

    new-instance v0, LYue/ۥۡۧۢۧ;

    invoke-direct {v0}, LYue/ۥۡۧۢۧ;-><init>()V

    const-string v1, "strong"

    const-string v2, "u"

    const-string v3, "b"

    const-string v4, "em"

    const-string v5, "i"

    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟([Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public varargs ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 4

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "No attribute names supplied."

    invoke-static {v0, v2}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟([Ljava/lang/String;)LYue/ۥۡۧۢۧ;

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    array-length v2, p2

    :goto_1
    if-ge v1, v2, :cond_1

    aget-object v3, p2, v1

    invoke-static {v3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {v3}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_2
    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-object p0
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 1

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object p2

    invoke-static {p3}, LYue/ۥۡۧۢۧ$ۥ۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟;

    move-result-object p3

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-object p0
.end method

.method public varargs ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 2

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    invoke-static {p2}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    :goto_0
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    :goto_1
    array-length p2, p3

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_2

    aget-object v1, p3, v0

    invoke-static {v1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {v1}, LYue/ۥۡۧۢۧ$ۥ۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-object p0
.end method

.method public varargs ۥ۟۟۟([Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 5

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-static {v2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    const-string v3, "noscript"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled"

    invoke-static {v3, v4}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    iget-object v3, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-static {v2}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۢ۠ۤ;
    .locals 3

    new-instance v0, LYue/ۥ۟ۢ۠ۤ;

    invoke-direct {v0}, LYue/ۥ۟ۢ۠ۤ;-><init>()V

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۡۧۢۧ$ۥ;

    invoke-virtual {v2}, LYue/ۥۡۧۢۧ$ۥ۟۟۟۟;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۧۢۧ$ۥ۟;

    invoke-virtual {v1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟۟;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۢ۠ۤ;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;LYue/ۥ۠۠ۥۥ;LYue/ۥ۟ۢ۠ۢ;)Z
    .locals 5

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {p3}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p2, p3, p1}, LYue/ۥۡۧۢۧ;->ۥ۟۟۠ۢ(LYue/ۥ۠۠ۥۥ;LYue/ۥ۟ۢ۠ۢ;Ljava/util/Set;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    move v3, v4

    :cond_1
    return v3

    :cond_2
    return v4

    :cond_3
    iget-object v1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۢ۠ۤ;

    move-result-object v0

    invoke-virtual {p3}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۡ۠(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۠ۤ;->ۥۣ۟۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    const-string v0, ":all"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0, v0, p2, p3}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟ۢ(Ljava/lang/String;LYue/ۥ۠۠ۥۥ;LYue/ۥ۟ۢ۠ۢ;)Z

    move-result p1

    if-eqz p1, :cond_5

    move v3, v4

    :cond_5
    return v3
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "#"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ".*\\s.*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۦ(Z)LYue/ۥۡۧۢۧ;
    .locals 0

    iput-boolean p1, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟۟:Z

    return-object p0
.end method

.method public varargs ۥ۟۟۟ۨ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 5

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "No attribute names supplied."

    invoke-static {v0, v2}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object v0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    array-length v3, p2

    :goto_1
    if-ge v1, v3, :cond_1

    aget-object v4, p2, v1

    invoke-static {v4}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {v4}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string p2, ":all"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_4
    return-object p0
.end method

.method public ۥ۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 1

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public varargs ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 5

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p1}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object p1

    invoke-static {p2}, LYue/ۥۡۧۢۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Cannot remove a protocol that is not set."

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2, v1}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    array-length v2, p3

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p3, v3

    invoke-static {v4}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {v4}, LYue/ۥۡۧۢۧ$ۥ۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p0
.end method

.method public varargs ۥ۟۟۠۠([Ljava/lang/String;)LYue/ۥۡۧۢۧ;
    .locals 4

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-static {v2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {v2}, LYue/ۥۡۧۢۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)LYue/ۥۡۧۢۧ$ۥ۟۟۟;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۡۧۢۧ;->ۥ:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, LYue/ۥۡۧۢۧ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public final ۥ۟۟۠ۢ(LYue/ۥ۠۠ۥۥ;LYue/ۥ۟ۢ۠ۢ;Ljava/util/Set;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            "LYue/\u06e5\u06df\u06e2\u06e0\u06e2;",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e7$\u06e5\u06df\u06df;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p2}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-boolean v0, p0, LYue/ۥۡۧۢۧ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_1

    invoke-virtual {p2, p1}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۠ۢ(Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LYue/ۥۡۧۢۧ$ۥ۟۟;

    invoke-virtual {p3}, LYue/ۥۡۧۢۧ$ۥ۟۟۟۟;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "#"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, LYue/ۥۡۧۢۧ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    return v1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ":"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
