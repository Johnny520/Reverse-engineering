.class public final Lyyds/ᛱᛷᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛱᛷᲀᲈ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x34808e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛱᛷᲀᲈ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᛱᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᛱᛷᲀᲈ;

    .line 15
    .line 16
    new-instance v0, Lyyds/ᲁᲀᛳ;

    .line 17
    .line 18
    const/16 v1, 0x19

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lyyds/ᲁᲀᛳ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lyyds/ᛱᛷᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 29
    .line 30
    return-void
.end method

.method public static ᛲᲈᲁ(Lio/github/libxposed/api/XposedInterface$HookHandle;)V
    .locals 2

    .line 1
    const-wide v0, -0x347ece68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lyyds/ᛱᛷᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 10
    .line 11
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lyyds/ᲇᛳᛸ;

    .line 16
    .line 17
    iget-object v0, v0, Lyyds/ᲇᛳᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static ᛵᛸᛸᛷ()V
    .locals 5

    .line 1
    sget-object v0, Lyyds/ᛱᛷᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lyyds/ᲇᛳᛸ;

    .line 8
    .line 9
    iget-object v1, v1, Lyyds/ᲇᛳᛸ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lyyds/ᲇᛳᛸ;

    .line 19
    .line 20
    iget-object v0, v0, Lyyds/ᲇᛳᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 37
    .line 38
    :try_start_0
    invoke-interface {v1}, Lio/github/libxposed/api/XposedInterface$HookHandle;->unhook()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v1

    .line 43
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 44
    .line 45
    const-wide v3, -0x347fbe68a836eL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v3, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void
.end method
