.class public abstract Lgx0;
.super Liy0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:Lr30;


# direct methods
.method public constructor <init>(Lr30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Liy0;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lgx0;->i:Lr30;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "type == null"

    .line 10
    .line 11
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method
