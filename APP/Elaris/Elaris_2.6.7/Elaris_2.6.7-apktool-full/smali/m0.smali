.class public final Lm0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public b:Ljava/lang/ref/WeakReference;

.field public c:Ljava/lang/ref/WeakReference;

.field public d:Ljava/lang/ref/WeakReference;

.field public e:Lk0;

.field public f:Z

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Lp0;

.field public final j:Ll0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lk0;Ln0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm0;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {p3, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, Lm0;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-direct {p3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lm0;->c:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lm0;->d:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    iput-object p5, p0, Lm0;->e:Lk0;

    .line 33
    .line 34
    iget-boolean p1, p6, Ln0;->b:Z

    .line 35
    .line 36
    iput-boolean p1, p0, Lm0;->f:Z

    .line 37
    .line 38
    iget p1, p6, Ln0;->a:I

    .line 39
    .line 40
    iput p1, p0, Lm0;->g:I

    .line 41
    .line 42
    iget-object p1, p6, Ln0;->c:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    iput-object p1, p0, Lm0;->h:Ljava/lang/String;

    .line 47
    .line 48
    new-instance p1, Ll0;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Ll0;-><init>(Lm0;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lm0;->j:Ll0;

    .line 54
    .line 55
    return-void
.end method
