.class public final Lu51;
.super Lo61;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final γ:Lu51;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lu51;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Lo61;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu51;->γ:Lu51;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final α(Lf81;Lp6;Lrw1;Len1;Lr71;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lbl1;

    .line 7
    .line 8
    iget-object p1, p4, Len1;->ι:Lb21;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lba1;

    .line 17
    .line 18
    :cond_0
    return-void
.end method
