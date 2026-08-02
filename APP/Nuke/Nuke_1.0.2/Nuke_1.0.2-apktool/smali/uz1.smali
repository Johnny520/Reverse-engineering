.class public final Luz1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Law1;


# instance fields
.field public h:Lof1;

.field public final i:Lkd1;


# direct methods
.method public constructor <init>(Lof1;Lkd1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luz1;->h:Lof1;

    .line 5
    .line 6
    iput-object p2, p0, Luz1;->i:Lkd1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 0

    .line 1
    iget-object p0, p0, Luz1;->i:Lkd1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkd1;->t0()Lc61;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lc61;->w()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
