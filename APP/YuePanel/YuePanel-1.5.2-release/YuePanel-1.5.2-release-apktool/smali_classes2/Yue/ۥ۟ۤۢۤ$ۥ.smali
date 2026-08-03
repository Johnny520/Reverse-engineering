.class public final LYue/ۥ۟ۤۢۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۤۢۤ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(I)LYue/ۥ۟ۤۢۤ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    invoke-virtual {v0, p1}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۦ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۤۢۤ;->values()[LYue/ۥ۟ۤۢۤ;

    move-result-object v0

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۣۨ;

    const/16 v1, 0x12

    const/16 v2, 0x1e

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    invoke-virtual {v0, p1}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۦ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LYue/ۥ۟ۤۢۤ;->values()[LYue/ۥ۟ۤۢۤ;

    move-result-object v0

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Category #"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not defined."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
