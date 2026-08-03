.class public final Ld1/s;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final h:Ld1/s;

.field public static final i:Ld1/s;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ld1/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Ld1/s;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ld1/s;->h:Ld1/s;

    .line 9
    .line 10
    new-instance v0, Ld1/s;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Ld1/s;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ld1/s;->i:Ld1/s;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Ld1/s;->g:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ld1/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ld1/a;

    .line 7
    .line 8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, Ld1/a;

    .line 12
    .line 13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
