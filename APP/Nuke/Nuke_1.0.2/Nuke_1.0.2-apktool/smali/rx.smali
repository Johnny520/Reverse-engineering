.class public final Lrx;
.super Lox;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Z


# direct methods
.method public constructor <init>(Ldk;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lox;-><init>(Ldk;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lrx;->j:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lrx;->j:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1}, Lox;->i(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, Lox;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldk;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ldk;->w(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
