.class public LYue/ۥۡۤ۠ۥ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/CharSequence;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟:Landroidx/core/graphics/drawable/IconCompat;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Z

.field public ۥ۟۟۟۠:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۤ۠ۥ;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, LYue/ۥۡۤ۠ۥ;->ۥ:Ljava/lang/CharSequence;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ:Ljava/lang/CharSequence;

    .line 4
    iget-object v0, p1, LYue/ۥۡۤ۠ۥ;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    .line 5
    iget-object v0, p1, LYue/ۥۡۤ۠ۥ;->ۥ۟۟:Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟:Ljava/lang/String;

    .line 6
    iget-object v0, p1, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟:Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟:Ljava/lang/String;

    .line 7
    iget-boolean v0, p1, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟:Z

    iput-boolean v0, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟:Z

    .line 8
    iget-boolean p1, p1, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠:Z

    iput-boolean p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠:Z

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۡۤ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۤ۠ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡۤ۠ۥ;-><init>(LYue/ۥۡۤ۠ۥ$ۥ۟۟;)V

    return-object v0
.end method

.method public ۥ۟(Z)LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟:Z

    return-object p0
.end method

.method public ۥ۟۟(Landroidx/core/graphics/drawable/IconCompat;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 0
    .param p1    # Landroidx/core/graphics/drawable/IconCompat;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public ۥ۟۟۟(Z)LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠:Z

    return-object p0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟:Ljava/lang/String;

    return-object p0
.end method
