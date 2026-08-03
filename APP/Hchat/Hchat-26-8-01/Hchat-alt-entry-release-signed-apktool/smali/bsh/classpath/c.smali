.class public final synthetic Lbsh/classpath/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/AbstractCollection;


# direct methods
.method public synthetic constructor <init>(Ljava/util/AbstractCollection;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbsh/classpath/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbsh/classpath/c;->b:Ljava/util/AbstractCollection;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lbsh/classpath/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/classpath/c;->b:Ljava/util/AbstractCollection;

    .line 7
    .line 8
    check-cast v0, Ljava/util/HashSet;

    .line 9
    .line 10
    check-cast p1, Lbsh/classpath/BshClassPath;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lbsh/classpath/BshClassPath;->f(Ljava/util/HashSet;Lbsh/classpath/BshClassPath;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lbsh/classpath/c;->b:Ljava/util/AbstractCollection;

    .line 17
    .line 18
    check-cast v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    check-cast p1, Lbsh/classpath/BshClassPath;

    .line 21
    .line 22
    invoke-static {v0, p1}, Lbsh/classpath/BshClassPath;->a(Ljava/util/ArrayList;Lbsh/classpath/BshClassPath;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
