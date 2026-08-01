.class public final synthetic Lvt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:Lic;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ZLic;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lvt1;->ε:Z

    .line 5
    .line 6
    iput-object p2, p0, Lvt1;->ζ:Lic;

    .line 7
    .line 8
    iput-object p3, p0, Lvt1;->η:Landroid/app/Activity;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    sget-object p1, Lbv1;->α:Lbv1;

    .line 2
    .line 3
    iget-boolean p1, p0, Lvt1;->ε:Z

    .line 4
    .line 5
    iget-object v0, p0, Lvt1;->ζ:Lic;

    .line 6
    .line 7
    iget-object p0, p0, Lvt1;->η:Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    if-ne p2, p1, :cond_0

    .line 13
    .line 14
    const-string p1, "pet_elf_task_image_uri"

    .line 15
    .line 16
    const-string p2, ""

    .line 17
    .line 18
    invoke-static {p1, p2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p1, "pet_elf_task_image_name"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "pet_elf_auto_image_enabled"

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p1, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v0, p2, p1}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const-string p1, "\u5df2\u6e05\u9664\u81ea\u52a8\u4efb\u52a1\u56fe\u7247\u5e76\u5173\u95ed\u56fe\u7247\u4efb\u52a1"

    .line 38
    .line 39
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance p1, Lcl1;

    .line 48
    .line 49
    const/4 p2, 0x4

    .line 50
    invoke-direct {p1, p2, v0}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p2, Lhu;

    .line 54
    .line 55
    const/16 v0, 0x19

    .line 56
    .line 57
    invoke-direct {p2, p1, p0, v0}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p2}, Lbv1;->Η(Landroid/app/Activity;La80;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
