.class public final Lb20;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lz10;


# instance fields
.field public final h:Lin0;

.field public final i:Lz10;


# direct methods
.method public constructor <init>(Lz10;Lin0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lb20;->h:Lin0;

    .line 8
    .line 9
    instance-of p2, p1, Lb20;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    check-cast p1, Lb20;

    .line 14
    .line 15
    iget-object p1, p1, Lb20;->i:Lz10;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lb20;->i:Lz10;

    .line 18
    .line 19
    return-void
.end method
