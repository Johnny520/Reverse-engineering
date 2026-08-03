.class public final LYue/ۥۡۧۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦۨۨ;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۢۦ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥۡۧۢۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e6<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public volatile ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public volatile ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥۡۧۢۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۧۢۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۦ$ۥ;

    const-class v0, Ljava/lang/Object;

    const-string v1, "\u06e5\u06df\u06df\u06e0\u06e4"

    const-class v2, LYue/ۥۡۧۢۦ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۠۠ۨ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۢۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    sget-object p1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    iput-object p1, p0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    sget-object v1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۢۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۡۧۢۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠۠ۨ;

    return-object v0

    :cond_1
    iget-object v0, p0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public isInitialized()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡۧۢۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    sget-object v1, LYue/ۥۢۢۧۧ;->ۥ:LYue/ۥۢۢۧۧ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۧۢۦ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۢۦ;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method

.method public final ۥ()Ljava/lang/Object;
    .locals 2

    new-instance v0, LYue/ۥ۠ۥۢ۟;

    invoke-virtual {p0}, LYue/ۥۡۧۢۦ;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۢ۟;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
