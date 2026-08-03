.class public LYue/ۥۢۥۣ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:I

.field public final synthetic ۥ۟۟۟ۢ:LYue/ۥۢۥۣ۟;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۣ۟;LYue/ۥ۟ۧ۟ۢ;LYue/ۥ۠ۧۡۤ;I)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟ۢ:LYue/ۥۢۥۣ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Ljava/lang/ref/WeakReference;

    iget-object p1, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡۨ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p3, p1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟:I

    iget-object p1, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p3, p1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟:I

    iget-object p1, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p3, p1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟:I

    iget-object p1, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p3, p1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۟:I

    iget-object p1, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۡ:LYue/ۥ۟ۧ۟۠;

    invoke-virtual {p3, p1}, LYue/ۥ۠ۧۡۤ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:I

    iput p4, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟ۡ:I

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 8

    iget-object v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LYue/ۥ۟ۧ۟ۢ;

    if-eqz v1, :cond_0

    iget v2, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟:I

    iget v3, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟:I

    iget v4, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟:I

    iget v5, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۟:I

    iget v6, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:I

    iget v7, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟ۡ:I

    invoke-virtual/range {v1 .. v7}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۧۥ(IIIIII)V

    :cond_0
    return-void
.end method
