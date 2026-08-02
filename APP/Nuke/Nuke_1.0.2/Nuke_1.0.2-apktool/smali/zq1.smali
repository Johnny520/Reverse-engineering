.class public final Lzq1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:Lmp;

.field public final synthetic c:Lyk2;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lmp;Lyk2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, Lzq1;->b:Lmp;

    .line 7
    .line 8
    iput-object p3, p0, Lzq1;->c:Lyk2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lzq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lzq1;->b:Lmp;

    .line 10
    .line 11
    invoke-virtual {p1}, Lmp;->y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lzk2;

    .line 18
    .line 19
    iget-object p0, p0, Lzq1;->c:Lyk2;

    .line 20
    .line 21
    iget-object p0, p0, Lyk2;->b:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "The UI request from "

    .line 24
    .line 25
    const-string v2, " was dismissed."

    .line 26
    .line 27
    invoke-static {v1, p0, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/16 v1, 0xc

    .line 32
    .line 33
    const-string v2, "UI_DISMISSED"

    .line 34
    .line 35
    invoke-direct {v0, v1, v2, p0}, Lzk2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lmp;->n(Ljava/lang/Throwable;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method
