.class public final Lxr2;
.super Lp40;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final n:Lwk1;


# direct methods
.method public constructor <init>(Lwk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxr2;->n:Lwk1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final k()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxr2;->n:Lwk1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwk1;->c()V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lwr2;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
