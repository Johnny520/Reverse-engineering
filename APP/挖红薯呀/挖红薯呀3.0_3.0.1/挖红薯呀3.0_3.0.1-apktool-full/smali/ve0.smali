.class public final synthetic Lve0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lvt0;

.field public final synthetic f:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Lvt0;Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p3, p0, Lve0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lve0;->e:Lvt0;

    .line 4
    .line 5
    iput-object p2, p0, Lve0;->f:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lve0;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lve0;->f:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object p0, p0, Lve0;->e:Lvt0;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1, p1}, Lvf0;->P(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-static {p0, v1, p1}, Lvf0;->z(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_1
    invoke-static {p0, v1, p1}, Lvf0;->I(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
