.class public final Lci/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final h:Lci/v;

.field public static final i:Lci/v;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lci/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lci/v;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lci/v;->h:Lci/v;

    .line 8
    .line 9
    new-instance v0, Lci/v;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lci/v;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lci/v;->i:Lci/v;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lci/v;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/v;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Leh/a;->j(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    throw p1

    .line 11
    :pswitch_0
    invoke-static {p1}, Leh/a;->j(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    throw p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
