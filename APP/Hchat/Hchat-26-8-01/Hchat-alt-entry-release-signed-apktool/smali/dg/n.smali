.class public final Ldg/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldg/n;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    check-cast p1, Lyf/h;

    .line 8
    .line 9
    iput-object p1, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 12
    iput p2, p0, Ldg/n;->a:I

    iput-object p1, p0, Ldg/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Ldg/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, [Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v1, Lgg/b;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lgg/b;-><init>([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_1
    new-instance v0, Log/d;

    .line 26
    .line 27
    iget-object v1, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/CharSequence;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, Lng/o;

    .line 36
    .line 37
    iget-object v1, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/io/File;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lng/o;-><init>(Ljava/io/File;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_3
    iget-object v0, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/Iterator;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_4
    iget-object v0, p0, Ldg/n;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lyf/h;

    .line 53
    .line 54
    invoke-static {v0}, Lfb/v0;->B(Lfg/p;)Lng/k;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_5
    new-instance v0, Ldg/m;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Ldg/m;-><init>(Ldg/n;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
