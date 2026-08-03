.class public final Ly1/r1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwf/f;
.implements Ly1/k2;
.implements Lm2/c;


# static fields
.field public static final synthetic g:Ly1/r1;

.field public static final h:Ly1/r1;

.field public static final i:Ly1/q2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly1/r1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly1/r1;->g:Ly1/r1;

    .line 7
    .line 8
    new-instance v0, Ly1/r1;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ly1/r1;->h:Ly1/r1;

    .line 14
    .line 15
    new-instance v0, Ly1/q2;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ly1/r1;->i:Ly1/q2;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(Ly1/a;)Lfg/a;
    .locals 3

    .line 1
    new-instance v0, Ly1/i2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ly1/i2;-><init>(Ly1/a;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lc1/b;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-direct {v1, p1, v2, v0}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method
