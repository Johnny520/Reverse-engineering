.class public LYue/ۥۢۤۦ۠$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦ۠;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦ۠$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۢۤۦ۠;->setScrollState(I)V

    iget-object v0, p0, LYue/ۥۢۤۦ۠$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v0}, LYue/ۥۢۤۦ۠;->ۥ۟۟ۡۨ()V

    return-void
.end method
