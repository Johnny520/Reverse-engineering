.class public abstract Ldd2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lb21;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ltq1;->α:[J

    .line 2
    .line 3
    new-instance v0, Lb21;

    .line 4
    .line 5
    invoke-direct {v0}, Lb21;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldd2;->α:Lb21;

    .line 9
    .line 10
    return-void
.end method

.method public static final α(Landroid/view/View;)Lun;
    .locals 1

    .line 1
    const v0, 0x7f090041

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lun;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lun;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
