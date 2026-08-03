.class public final synthetic Lp8/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lp8/x;


# direct methods
.method public synthetic constructor <init>(Lp8/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp8/w;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lp8/w;->h:Lp8/x;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp8/w;->g:I

    .line 2
    .line 3
    check-cast p1, Lhh/i;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lhh/i;->p()Llh/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, Llh/a;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, Lp8/w;->h:Lp8/x;

    .line 18
    .line 19
    iget-object v0, v0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lhh/i;->p()Llh/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, Llh/a;->g:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p0, Lp8/w;->h:Lp8/x;

    .line 36
    .line 37
    iget-object v0, v0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 38
    .line 39
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lhh/i;->p()Llh/a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, Llh/a;->g:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lp8/w;->h:Lp8/x;

    .line 54
    .line 55
    iget-object v0, v0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 56
    .line 57
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
