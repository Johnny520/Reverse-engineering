.class public final LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۡۦ;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e1\u06e6"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":root"

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 1

    instance-of v0, p1, LYue/ۥ۠۟ۧۥ;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۨ()LYue/ۥ۠۠ۥۥ;

    move-result-object p1

    :cond_0
    if-ne p2, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
