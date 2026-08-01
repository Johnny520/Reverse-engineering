.class public final Lwr;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lss1;


# instance fields
.field public final α:Ljava/lang/CharSequence;

.field public final β:I

.field public final γ:Le80;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILe80;)V
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
    iput-object p1, p0, Lwr;->α:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput p2, p0, Lwr;->β:I

    .line 10
    .line 11
    iput-object p3, p0, Lwr;->γ:Le80;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lvr;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lvr;-><init>(Lwr;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
