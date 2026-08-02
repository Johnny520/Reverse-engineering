.class public final Lmt1;
.super Ljm1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final c:Lfm1;


# direct methods
.method public constructor <init>(Lot1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfm1;

    .line 5
    .line 6
    new-instance v1, Liz;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v2, p1}, Liz;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lfm1;-><init>(Liz;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lfm1;->b(Ljm1;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lmt1;->c:Lfm1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 0

    .line 1
    return-void
.end method
