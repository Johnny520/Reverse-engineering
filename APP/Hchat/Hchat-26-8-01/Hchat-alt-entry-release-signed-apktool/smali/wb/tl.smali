.class public final synthetic Lwb/tl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Lfg/a;II)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/tl;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/tl;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/tl;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/tl;->j:Lfg/a;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/tl;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x181

    .line 14
    .line 15
    invoke-static {p2}, Li0/r;->C(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v0, p0, Lwb/tl;->h:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v1, p0, Lwb/tl;->i:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    iget-object v2, p0, Lwb/tl;->j:Lfg/a;

    .line 24
    .line 25
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->p(Landroid/content/Context;Landroid/content/SharedPreferences;Lfg/a;Li0/h0;I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    const/16 p2, 0x181

    .line 32
    .line 33
    invoke-static {p2}, Li0/r;->C(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget-object v0, p0, Lwb/tl;->h:Landroid/content/Context;

    .line 38
    .line 39
    iget-object v1, p0, Lwb/tl;->i:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    iget-object v2, p0, Lwb/tl;->j:Lfg/a;

    .line 42
    .line 43
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->L1(Landroid/content/Context;Landroid/content/SharedPreferences;Lfg/a;Li0/h0;I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
