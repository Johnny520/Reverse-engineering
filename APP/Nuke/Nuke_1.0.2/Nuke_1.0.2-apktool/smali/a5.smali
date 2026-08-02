.class public final La5;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:La51;

.field public final b:Z

.field public c:Ld92;


# direct methods
.method public constructor <init>(La51;Lhf0;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p3, p1}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La5;->a:La51;

    .line 10
    .line 11
    iget-boolean p1, p2, Lhf0;->h:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, La5;->c:Ld92;

    .line 15
    .line 16
    iput-boolean p1, p0, La5;->b:Z

    .line 17
    .line 18
    return-void
.end method
