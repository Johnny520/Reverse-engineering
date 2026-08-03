.class public LYue/ۥ۠ۡۥۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟:Ljava/lang/String; = ""


# instance fields
.field public ۥ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۡۥۨ;->ۥ:Ljava/util/Map;

    return-void
.end method

.method public static ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠ۡۥۨ;
    .locals 8

    new-instance v0, LYue/ۥ۠ۡۥۨ;

    invoke-direct {v0}, LYue/ۥ۠ۡۥۨ;-><init>()V

    const-string v1, ";"

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, LYue/ۥ۠ۡۥۨ;->ۥ۟:Ljava/lang/String;

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_4

    aget-object v4, p0, v3

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    if-le v5, v2, :cond_2

    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    :cond_0
    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x2

    if-le v6, v7, :cond_3

    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    const-string v5, ""

    :cond_3
    :goto_1
    iget-object v6, v0, LYue/ۥ۠ۡۥۨ;->ۥ:Ljava/util/Map;

    aget-object v4, v4, v1

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۥۨ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۥۨ;->ۥ:Ljava/util/Map;

    return-object v0
.end method
