.class public LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤۦ۟$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "LYue/\u06e5\u06e1\u06e4\u06e6\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ:LYue/ۥۡۤۦ۟$ۥ۟;

.field public ۥ۟:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(LYue/ۥۡۤۦ۟$ۥ۟;Ljava/lang/CharSequence;)V
    .locals 0
    .param p1    # LYue/ۥۡۤۦ۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;->ۥ:LYue/ۥۡۤۦ۟$ۥ۟;

    iput-object p2, p0, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;->ۥ۟:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;->ۥ()LYue/ۥۡۤۦ۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥۡۤۦ۟;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;->ۥ۟:Ljava/lang/CharSequence;

    iget-object v1, p0, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;->ۥ:LYue/ۥۡۤۦ۟$ۥ۟;

    invoke-static {v0, v1}, LYue/ۥۡۤۦ۟;->ۥ(Ljava/lang/CharSequence;LYue/ۥۡۤۦ۟$ۥ۟;)LYue/ۥۡۤۦ۟;

    move-result-object v0

    return-object v0
.end method
