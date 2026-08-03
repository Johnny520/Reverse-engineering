.class public final LYue/ۥ۠ۤۨۢ$ۥ۟$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۤۨۢ$ۥ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨۢ$ۥ۟$ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۤۡۢ;->ۥ:LYue/ۥۡۤۡۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۡ()LYue/ۥۡۤۡۢ;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟ۨ(LYue/ۥۡۤۡۢ;Ljava/lang/String;ILjava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method
