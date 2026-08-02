.class public final Lqe0;
.super Lke0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ldx0;


# instance fields
.field public final t:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Lqe0;->t:S

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lmj0;->m(I)V

    .line 3
    .line 4
    .line 5
    iget-short p0, p0, Lqe0;->t:S

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lmj0;->d(S)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    invoke-virtual {p1, p0}, Lmj0;->l(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lmj0;->g()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 21
    .line 22
    .line 23
    return p0
.end method
