.class public final LYue/ۥ۠ۦ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦ۟۟;
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
    invoke-direct {p0}, LYue/ۥ۠ۦ۟۟$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۠ۦ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۟۟$ۥ;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥ۠ۦ۟۟;

    invoke-direct {v0}, LYue/ۥ۠ۦ۟۟;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final ۥ۟()Z
    .locals 1

    invoke-static {}, LYue/ۥ۠ۦ۟۟;->ۥۣ۟۟۠()Z

    move-result v0

    return v0
.end method
