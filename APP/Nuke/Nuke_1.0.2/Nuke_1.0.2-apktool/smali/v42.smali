.class public final Lv42;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic l:Lcom/dokar/quickjs/QuickJs;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(Lcom/dokar/quickjs/QuickJs;Ljava/lang/String;Ljava/lang/String;ZLt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv42;->l:Lcom/dokar/quickjs/QuickJs;

    .line 2
    .line 3
    iput-object p2, p0, Lv42;->m:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lv42;->n:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p4, p0, Lv42;->o:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p5}, Ltw2;-><init>(ILt00;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lt00;

    .line 3
    .line 4
    new-instance v0, Lv42;

    .line 5
    .line 6
    iget-object v3, p0, Lv42;->n:Ljava/lang/String;

    .line 7
    .line 8
    iget-boolean v4, p0, Lv42;->o:Z

    .line 9
    .line 10
    iget-object v1, p0, Lv42;->l:Lcom/dokar/quickjs/QuickJs;

    .line 11
    .line 12
    iget-object v2, p0, Lv42;->m:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lv42;-><init>(Lcom/dokar/quickjs/QuickJs;Ljava/lang/String;Ljava/lang/String;ZLt00;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, La83;->a:La83;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lv42;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv42;->l:Lcom/dokar/quickjs/QuickJs;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/dokar/quickjs/QuickJs;->access$getContext$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-static {v0}, Lcom/dokar/quickjs/QuickJs;->access$getGlobals$p(Lcom/dokar/quickjs/QuickJs;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    iget-object v6, p0, Lv42;->n:Ljava/lang/String;

    .line 15
    .line 16
    iget-boolean v7, p0, Lv42;->o:Z

    .line 17
    .line 18
    iget-object v5, p0, Lv42;->m:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static/range {v0 .. v7}, Lcom/dokar/quickjs/QuickJs;->access$evaluate(Lcom/dokar/quickjs/QuickJs;JJLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
