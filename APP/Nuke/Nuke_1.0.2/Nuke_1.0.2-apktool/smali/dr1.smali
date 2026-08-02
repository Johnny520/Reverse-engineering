.class public final synthetic Ldr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lin0;

.field public final synthetic l:Luh1;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lin0;

.field public final synthetic o:Z

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lin0;Luh1;Ljava/lang/String;Lin0;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldr1;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldr1;->i:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Ldr1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Ldr1;->k:Lin0;

    .line 11
    .line 12
    iput-object p5, p0, Ldr1;->l:Luh1;

    .line 13
    .line 14
    iput-object p6, p0, Ldr1;->m:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Ldr1;->n:Lin0;

    .line 17
    .line 18
    iput-boolean p8, p0, Ldr1;->o:Z

    .line 19
    .line 20
    iput p9, p0, Ldr1;->p:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ldr1;->p:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, Ldr1;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Ldr1;->i:Ljava/util/List;

    .line 20
    .line 21
    iget-object v2, p0, Ldr1;->j:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v3, p0, Ldr1;->k:Lin0;

    .line 24
    .line 25
    iget-object v4, p0, Ldr1;->l:Luh1;

    .line 26
    .line 27
    iget-object v5, p0, Ldr1;->m:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v6, p0, Ldr1;->n:Lin0;

    .line 30
    .line 31
    iget-boolean v7, p0, Ldr1;->o:Z

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Leu;->m(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lin0;Luh1;Ljava/lang/String;Lin0;ZLpx;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, La83;->a:La83;

    .line 37
    .line 38
    return-object p0
.end method
