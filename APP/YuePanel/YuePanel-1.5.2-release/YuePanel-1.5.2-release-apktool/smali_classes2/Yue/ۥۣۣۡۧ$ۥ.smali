.class public final LYue/ۥۣۣۡۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۣۡۧ;
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
    invoke-direct {p0}, LYue/ۥۣۣۡۧ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۣۣۡۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣۣۡۧ$ۥ;->ۥ۟()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۣۣۡۧ;

    invoke-direct {v0, v1}, LYue/ۥۣۣۡۧ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public final ۥ۟()Z
    .locals 1

    invoke-static {}, LYue/ۥۣۣۡۧ;->ۥۣ۟۟۠()Z

    move-result v0

    return v0
.end method
