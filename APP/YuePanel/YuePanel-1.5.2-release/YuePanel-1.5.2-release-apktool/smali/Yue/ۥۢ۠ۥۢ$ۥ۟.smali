.class public LYue/ۥۢ۠ۥۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۥۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟ۡۥ:I = 0x0

.field public static final ۥ۟۟ۡۦ:I = 0x0

.field public static final ۥ۟۟ۡۧ:I = 0x0

.field public static final ۥ۟۟ۡۨ:I = 0x0

.field public static final ۥ۟۟ۢ:I = 0x0

.field public static final ۥ۟۟ۢ۟:Z = false

.field public static final ۥ۟۟ۢ۠:Z = true

.field public static final ۥ۟۟ۢۡ:Z = true


# instance fields
.field public ۥ:Landroid/view/Menu;

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:Z

.field public ۥۣ۟۟۟:I

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۧ:I

.field public ۥ۟۟۟ۨ:C

.field public ۥ۟۟۠:I

.field public ۥ۟۟۠۟:C

.field public ۥ۟۟۠۠:I

.field public ۥ۟۟۠ۡ:I

.field public ۥ۟۟۠ۢ:Z

.field public ۥۣ۟۟۠:Z

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:Ljava/lang/String;

.field public ۥ۟۟۠ۨ:Ljava/lang/String;

.field public ۥ۟۟ۡ:Ljava/lang/String;

.field public ۥ۟۟ۡ۟:LYue/ۥ۟۟ۧ۠;

.field public ۥ۟۟ۡ۠:Ljava/lang/CharSequence;

.field public ۥ۟۟ۡۡ:Ljava/lang/CharSequence;

.field public ۥ۟۟ۡۢ:Landroid/content/res/ColorStateList;

.field public ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢ۠ۥۢ;Landroid/view/Menu;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x10
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۢ:Landroid/content/res/ColorStateList;

    iput-object p1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ:Landroid/view/Menu;

    invoke-virtual {p0}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۢ()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ:Landroid/view/Menu;

    iget v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟:I

    iget v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۟:I

    iget v3, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۤ:I

    iget-object v4, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۟(Landroid/view/MenuItem;)V

    return-void
.end method

.method public ۥ۟()Landroid/view/SubMenu;
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ:Landroid/view/Menu;

    iget v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟:I

    iget v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۟:I

    iget v3, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۤ:I

    iget-object v4, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۟(Landroid/view/MenuItem;)V

    return-object v0
.end method

.method public final ۥ۟۟(Ljava/lang/String;)C
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۢ:Z

    return v0
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    iget-object v0, v0, LYue/ۥۢ۠ۥۢ;->ۥ۟۟:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot instantiate class: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "SupportMenuInflater"

    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟۠(Landroid/util/AttributeSet;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    iget-object v0, v0, LYue/ۥۢ۠ۥۢ;->ۥ۟۟:Landroid/content/Context;

    sget-object v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۢ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۢۥ:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۢۧ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۢۨ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۟:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۢۦ:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۠:Z

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۢۤ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۡ:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroid/util/AttributeSet;)V
    .locals 6

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    iget-object v0, v0, LYue/ۥۢ۠ۥۢ;->ۥ۟۟:Landroid/content/Context;

    sget-object v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡ۟:[I

    invoke-static {v0, p1, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۤ(Landroid/content/Context;Landroid/util/AttributeSet;[I)LYue/ۥۢۡۥۦ;

    move-result-object p1

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۢ:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۟:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۥ:I

    iget v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟:I

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    sget v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۦ:I

    iget v3, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟:I

    invoke-virtual {p1, v2, v3}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v2

    const/high16 v3, -0x10000

    and-int/2addr v0, v3

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۤ:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۧ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۧ(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۨ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۧ(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡ۠:I

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۧ:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۨ:C

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۥ:I

    const/16 v2, 0x1000

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤ۟:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠۟:C

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۥ:I

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠۠:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤ۠:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤ۠:I

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۡ:I

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۟:I

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۡ:I

    :goto_0
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣۣ۟ۡ:I

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۢ:Z

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۤ:I

    iget-boolean v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۠:Z

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۠:Z

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۡ:I

    iget-boolean v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۡ:Z

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۤ:Z

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۥ۟:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۥ:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۡ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۢ:I

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۦ:I

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۤ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۡۤ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget v5, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۦ:I

    if-nez v5, :cond_2

    iget-object v5, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez v5, :cond_2

    sget-object v3, LYue/ۥۢ۠ۥۢ;->ۥ۟۟۟ۥ:[Ljava/lang/Class;

    iget-object v5, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    iget-object v5, v5, LYue/ۥۢ۠ۥۢ;->ۥ۟:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v3, v5}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۟(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟۟ۧ۠;

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ۟:LYue/ۥ۟۟ۧ۠;

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    const-string v0, "SupportMenuInflater"

    const-string v3, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iput-object v4, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ۟:LYue/ۥ۟۟ۧ۠;

    :goto_2
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۦ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۧ(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ۠:Ljava/lang/CharSequence;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۥ۠:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۧ(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۡ:Ljava/lang/CharSequence;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۨ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۨ:I

    invoke-virtual {p1, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    iget-object v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v2}, LYue/ۥ۠۠ۡۥ;->ۥ۟۟۟۟(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_3

    :cond_4
    iput-object v4, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    :goto_3
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۧ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۡۤۧ:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۢ:Landroid/content/res/ColorStateList;

    goto :goto_4

    :cond_5
    iput-object v4, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۢ:Landroid/content/res/ColorStateList;

    :goto_4
    invoke-virtual {p1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    iput-boolean v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۢ:Z

    return-void
.end method

.method public ۥ۟۟۟ۢ()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟:I

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟:I

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟:I

    iput v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۟:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۠:Z

    iput-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۡ:Z

    return-void
.end method

.method public final ۥۣ۟۟۟(Landroid/view/MenuItem;)V
    .locals 5

    iget-boolean v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۢ:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟۠:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۤ:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۡ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۧ:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    iget v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۥ:I

    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    :cond_1
    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    iget-object v0, v0, LYue/ۥۢ۠ۥۢ;->ۥ۟۟:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, LYue/ۥۢ۠ۥۢ$ۥ;

    iget-object v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    invoke-virtual {v1}, LYue/ۥۢ۠ۥۢ;->ۥ۟()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    invoke-direct {v0, v1, v4}, LYue/ۥۢ۠ۥۢ$ۥ;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۡ:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_5

    instance-of v0, p1, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    invoke-virtual {v0, v3}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ(Z)V

    goto :goto_2

    :cond_4
    instance-of v0, p1, LYue/ۥۡ۠ۦۥ;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LYue/ۥۡ۠ۦۥ;

    invoke-virtual {v0, v3}, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۟ۤ(Z)V

    :cond_5
    :goto_2
    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-eqz v0, :cond_6

    sget-object v1, LYue/ۥۢ۠ۥۢ;->ۥ۟۟۟ۤ:[Ljava/lang/Class;

    iget-object v2, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۤ:LYue/ۥۢ۠ۥۢ;

    iget-object v2, v2, LYue/ۥۢ۠ۥۢ;->ۥ:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v1, v2}, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟۟(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    move v2, v3

    :cond_6
    iget v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠ۦ:I

    if-lez v0, :cond_8

    if-nez v2, :cond_7

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    goto :goto_3

    :cond_7
    const-string v0, "SupportMenuInflater"

    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_3
    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ۟:LYue/ۥ۟۟ۧ۠;

    if-eqz v0, :cond_9

    invoke-static {p1, v0}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۟ۦ(Landroid/view/MenuItem;LYue/ۥ۟۟ۧ۠;)Landroid/view/MenuItem;

    :cond_9
    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡ۠:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۠۟(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۡ:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۠ۦ(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    iget-char v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۟ۨ:C

    iget v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠:I

    invoke-static {p1, v0, v1}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۠(Landroid/view/MenuItem;CI)V

    iget-char v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠۟:C

    iget v1, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟۠۠:I

    invoke-static {p1, v0, v1}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۠ۢ(Landroid/view/MenuItem;CI)V

    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_a

    invoke-static {p1, v0}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۠ۡ(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V

    :cond_a
    iget-object v0, p0, LYue/ۥۢ۠ۥۢ$ۥ۟;->ۥ۟۟ۡۢ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_b

    invoke-static {p1, v0}, LYue/ۥۡ۠ۦۣ;->ۥ۟۟۠۠(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    :cond_b
    return-void
.end method
