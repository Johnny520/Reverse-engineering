.class public abstract Lxv1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Leq1;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Leq1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lmy;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lmy;-><init>(Lin0;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lxv1;->a:Lmy;

    .line 13
    .line 14
    return-void
.end method
