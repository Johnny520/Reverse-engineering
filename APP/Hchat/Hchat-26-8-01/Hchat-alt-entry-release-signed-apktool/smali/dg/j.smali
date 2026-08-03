.class public final Ldg/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;


# instance fields
.field public final synthetic a:I

.field public final b:Lfg/l;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/File;Ldg/k;Lc9/x;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldg/j;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ldg/j;->c:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, Ldg/j;->d:Ljava/lang/Object;

    .line 23
    iput-object p3, p0, Ldg/j;->b:Lfg/l;

    return-void
.end method

.method public constructor <init>(Lng/j;Lfg/l;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldg/j;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldg/j;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Ldg/j;->b:Lfg/l;

    .line 16
    .line 17
    iput-object p3, p0, Ldg/j;->d:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Ldg/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lng/h;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lng/h;-><init>(Ldg/j;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Ldg/h;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ldg/h;-><init>(Ldg/j;)V

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
