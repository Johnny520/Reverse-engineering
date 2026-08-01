.class public final Ll72;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ld4;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Le40;


# direct methods
.method public constructor <init>(FF)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll72;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Le40;

    .line 8
    .line 9
    const v1, 0x3c23d70a    # 0.01f

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, p2, v1}, Le40;-><init>(FFF)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ll72;->ζ:Le40;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Le40;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll72;->ε:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll72;->ζ:Le40;

    return-void
.end method


# virtual methods
.method public final get(I)Le40;
    .locals 0

    .line 1
    iget p1, p0, Ll72;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ll72;->ζ:Le40;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Ll72;->ζ:Le40;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
