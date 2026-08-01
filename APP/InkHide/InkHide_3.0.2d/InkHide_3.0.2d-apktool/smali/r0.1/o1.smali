.class public final synthetic Lr0/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/t1;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Lr0/t1;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lr0/o1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/o1;->b:Lr0/t1;

    iput-object p2, p0, Lr0/o1;->c:Ljava/lang/String;

    iput-object p3, p0, Lr0/o1;->d:Ljava/lang/reflect/Method;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/t1;Ljava/lang/reflect/Method;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lr0/o1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/o1;->b:Lr0/t1;

    iput-object p2, p0, Lr0/o1;->d:Ljava/lang/reflect/Method;

    iput-object p3, p0, Lr0/o1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr0/o1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm0/e;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/o1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lr0/o1;->d:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    iget-object v3, p0, Lr0/o1;->b:Lr0/t1;

    .line 13
    .line 14
    invoke-direct {v0, v3, v1, v2}, Lm0/e;-><init>(Lr0/t1;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, Lr0/r1;

    .line 19
    .line 20
    iget-object v1, p0, Lr0/o1;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Lr0/o1;->b:Lr0/t1;

    .line 23
    .line 24
    iget-object v3, p0, Lr0/o1;->d:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-direct {v0, v2, v3, v1}, Lr0/r1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
