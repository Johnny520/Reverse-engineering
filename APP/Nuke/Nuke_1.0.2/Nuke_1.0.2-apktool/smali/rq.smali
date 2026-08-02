.class public final Lrq;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final c:Lrq;


# instance fields
.field public final a:Lag;

.field public b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrq;

    .line 2
    .line 3
    invoke-direct {v0}, Lrq;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrq;->c:Lrq;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lag;

    .line 5
    .line 6
    invoke-direct {v0}, Lag;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lrq;->a:Lag;

    .line 10
    .line 11
    return-void
.end method
