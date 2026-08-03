.class public final synthetic Lwb/pn;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic n:Le9/s;

.field public final synthetic o:Li0/a1;


# direct methods
.method public constructor <init>(Le9/s;Li0/a1;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lwb/pn;->n:Le9/s;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/pn;->o:Li0/a1;

    .line 4
    .line 5
    const-class p1, Lgg/k;

    .line 6
    .line 7
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v4, "CustomNotificationMiuixPage$saveRules(Lh/Hchat/hooks/items/customnotify/CustomNotificationSettings;Landroidx/compose/runtime/MutableState;Ljava/util/List;)V"

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    const-string v3, "saveRules"

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    invoke-direct/range {v0 .. v5}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/pn;->n:Le9/s;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/pn;->o:Li0/a1;

    .line 9
    .line 10
    invoke-static {v0, v1, p1}, Lwb/ho;->m0(Le9/s;Li0/a1;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object p1
.end method
