.class public final LYue/ۥۢ۟ۧۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۧۨ;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۧۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/StackTraceElement;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۧۨ;Ljava/lang/StackTraceElement;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۧۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/StackTraceElement;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۟ۧۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۧۨ;

    iput-object p2, p0, LYue/ۥۢ۟ۧۥ;->ۥ۟۟۠ۤ:Ljava/lang/StackTraceElement;

    return-void
.end method


# virtual methods
.method public getCallerFrame()LYue/ۥ۟ۧۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۧۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۧۨ;

    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۧۥ;->ۥ۟۟۠ۤ:Ljava/lang/StackTraceElement;

    return-object v0
.end method
