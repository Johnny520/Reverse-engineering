.class public abstract Lyo1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lxo1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lea1;

    .line 2
    .line 3
    const/16 v1, 0x32

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-direct {v0, v1}, Lea1;-><init>(F)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lxo1;

    .line 10
    .line 11
    invoke-direct {v1, v0, v0, v0, v0}, Lxo1;-><init>(Lea1;Lea1;Lea1;Lea1;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lyo1;->α:Lxo1;

    .line 15
    .line 16
    return-void
.end method
