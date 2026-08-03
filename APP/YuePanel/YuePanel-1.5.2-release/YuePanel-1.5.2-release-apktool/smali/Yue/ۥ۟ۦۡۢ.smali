.class public abstract LYue/ۥ۟ۦۡۢ;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۦۡۢ$ۥ;,
        LYue/ۥ۟ۦۡۢ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
        "LYue/\u06e5\u06df\u06e6\u06e1\u06e3;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "LYue/\u06e5\u06df\u06e6\u06e1\u06e3;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥ۟ۦۡۢ$ۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e1\u06e2$\u06e5<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:LYue/ۥ۟ۦۡۢ$ۥ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e1\u06e2$\u06e5\u06df<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2a6

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۦۡۢ;->ۥ:Landroid/util/SparseArray;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۦۡۢ;->ۥ۟:Ljava/util/List;

    return-void
.end method

.method public static native synthetic ۥ۟(LYue/ۥ۟ۦۡۢ;Ljava/lang/Object;ILandroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟(LYue/ۥ۟ۦۡۢ;Ljava/lang/Object;ILandroid/view/View;)Z
.end method


# virtual methods
.method public native getItemCount()I
.end method

.method public bridge native synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation
.end method

.method public bridge native synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation
.end method

.method public bridge native synthetic onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation
.end method

.method public native ۥ۟۟۟(ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation
.end method

.method public native ۥ۟۟۟۟(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟۠(LYue/ۥ۟ۦۣۡ;Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e6\u06e1\u06e3;",
            "TT;I)V"
        }
    .end annotation
.end method

.method public native ۥ۟۟۟ۡ(I)V
.end method

.method public native ۥ۟۟۟ۢ()V
.end method

.method public native ۥۣ۟۟۟()V
.end method

.method public native ۥ۟۟۟ۤ()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۟ۥ(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۦ()I
.end method

.method public native ۥ۟۟۟ۧ(I)Landroid/view/View;
.end method

.method public final native synthetic ۥ۟۟۟ۨ(Ljava/lang/Object;ILandroid/view/View;)V
.end method

.method public final native synthetic ۥ۟۟۠(Ljava/lang/Object;ILandroid/view/View;)Z
.end method

.method public native ۥ۟۟۠۟(LYue/ۥ۟ۦۣۡ;I)V
.end method

.method public native ۥ۟۟۠۠(Landroid/view/ViewGroup;I)LYue/ۥ۟ۦۣۡ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public native ۥ۟۟۠ۡ(LYue/ۥ۟ۦۣۡ;)V
.end method

.method public native ۥ۟۟۠ۢ(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public native ۥۣ۟۟۠(LYue/ۥ۟ۦۡۢ$ۥ;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e6\u06e1\u06e2$\u06e5<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public native ۥ۟۟۠ۤ(LYue/ۥ۟ۦۡۢ$ۥ۟;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e6\u06e1\u06e2$\u06e5\u06df<",
            "TT;>;)V"
        }
    .end annotation
.end method
