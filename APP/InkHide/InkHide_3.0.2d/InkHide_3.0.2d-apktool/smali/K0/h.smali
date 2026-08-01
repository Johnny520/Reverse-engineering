.class public final LK0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/h;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LM0/a;LM0/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK0/h;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, LN0/h;

    iput-object p1, p0, LK0/h;->b:Ljava/lang/Object;

    iput-object p2, p0, LK0/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LT0/h;LM0/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LK0/h;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LK0/h;->b:Ljava/lang/Object;

    iput-object p2, p0, LK0/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK0/h;->a:I

    sget-object v0, LK0/i;->a:LK0/i;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LK0/h;->b:Ljava/lang/Object;

    .line 3
    iput-object v0, p0, LK0/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;LM0/p;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LK0/h;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LK0/h;->b:Ljava/lang/Object;

    .line 9
    check-cast p2, LN0/h;

    iput-object p2, p0, LK0/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, LK0/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LU0/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LU0/b;-><init>(LK0/h;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, LT0/m;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LT0/m;-><init>(LK0/h;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, LT0/g;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LT0/g;-><init>(LK0/h;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_2
    new-instance v0, LK0/f;

    .line 25
    .line 26
    invoke-direct {v0, p0}, LK0/f;-><init>(LK0/h;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
