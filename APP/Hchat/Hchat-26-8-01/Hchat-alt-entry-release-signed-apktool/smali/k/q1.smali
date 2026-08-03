.class public final Lk/q1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk/o1;


# static fields
.field public static final b:Lk/q1;

.field public static final c:Lk/q1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk/q1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lk/q1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk/q1;->b:Lk/q1;

    .line 8
    .line 9
    new-instance v0, Lk/q1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lk/q1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lk/q1;->c:Lk/q1;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk/q1;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget v0, p0, Lk/q1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :pswitch_0
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/view/View;Lu2/c;)Lk/n1;
    .locals 1

    .line 1
    iget p2, p0, Lk/q1;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Lk/r1;

    .line 7
    .line 8
    new-instance v0, Landroid/widget/Magnifier;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, v0}, Lk/p1;-><init>(Landroid/widget/Magnifier;)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lk/p1;

    .line 18
    .line 19
    new-instance v0, Landroid/widget/Magnifier;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p2, v0}, Lk/p1;-><init>(Landroid/widget/Magnifier;)V

    .line 25
    .line 26
    .line 27
    return-object p2

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
