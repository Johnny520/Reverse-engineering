.class public final LYue/ۥۡۧۤۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۤۡ;
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
    invoke-direct {p0}, LYue/ۥۡۧۤۡ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥۡۧۤۢ;)LYue/ۥۡۧۤۡ;
    .locals 2
    .param p1    # LYue/ۥۡۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۧۤۡ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LYue/ۥۡۧۤۡ;-><init>(LYue/ۥۡۧۤۢ;LYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method
