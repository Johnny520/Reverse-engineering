.class public final Lms1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lr43;


# instance fields
.field public final synthetic h:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lms1;->h:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lir0;Lj63;)Lq43;
    .locals 1

    .line 1
    iget-object p2, p2, Lj63;->a:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Lns1;

    .line 8
    .line 9
    iget p0, p0, Lms1;->h:I

    .line 10
    .line 11
    invoke-direct {p2, p1, p0}, Lns1;-><init>(Lir0;I)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
