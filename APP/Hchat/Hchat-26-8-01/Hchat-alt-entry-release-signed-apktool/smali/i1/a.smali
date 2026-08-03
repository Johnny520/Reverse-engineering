.class public final Li1/a;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final h:Li1/a;

.field public static final i:Li1/a;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li1/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Li1/a;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li1/a;->h:Li1/a;

    .line 9
    .line 10
    new-instance v0, Li1/a;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Li1/a;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Li1/a;->i:Li1/a;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Li1/a;->g:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Li1/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Lh1/d;

    .line 8
    .line 9
    sget-wide v2, Lf1/w;->f:J

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/16 v8, 0x7e

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-static/range {v1 .. v8}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lh1/d;

    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
