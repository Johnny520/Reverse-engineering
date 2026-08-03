.class public final synthetic Lbsh/classpath/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;


# direct methods
.method public synthetic constructor <init>(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbsh/classpath/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbsh/classpath/a;->b:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

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
    iget v0, p0, Lbsh/classpath/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/classpath/a;->b:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lbsh/classpath/BshClassPath;->g(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lbsh/classpath/a;->b:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 15
    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lbsh/classpath/BshClassPath;->j(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Lbsh/classpath/a;->b:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 23
    .line 24
    check-cast p1, Lbsh/classpath/BshClassPath;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lbsh/classpath/BshClassPath;->c(Lbsh/classpath/BshClassPath$UnqualifiedNameTable;Lbsh/classpath/BshClassPath;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
