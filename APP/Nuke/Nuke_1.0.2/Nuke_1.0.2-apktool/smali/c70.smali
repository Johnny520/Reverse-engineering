.class public final Lc70;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Luo2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lun0;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Lmn0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc70;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lc70;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lc70;->c:Lun0;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lxm0;Lin0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc70;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc70;->b:Ljava/lang/Object;

    iput-object p2, p0, Lc70;->c:Lun0;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lc70;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lro0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lro0;-><init>(Lc70;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lb70;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lb70;-><init>(Lc70;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
