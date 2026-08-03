.class public LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨ۟ۢ$ۥ۟;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۨ۟ۢ$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥۡۨ۟ۢ$ۥ۟;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۨ۟ۢ$ۥ۟;

    iput-object p2, p0, LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۨ۟ۢ$ۥ۟;

    iget-object v0, v0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۨ۟ۢ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-interface {v0, v1}, LYue/ۥۡۨ۟ۢ$ۥ۟۟۟;->ۥ(Ljava/lang/Object;)V

    return-void
.end method
