/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Setting extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord> {

	private static final long serialVersionUID = 1598192699;

	/**
	 * The singleton instance of <code>dstack.setting</code>
	 */
	public static final io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Setting SETTING = new io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Setting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord.class;
	}

	/**
	 * The column <code>dstack.setting.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.setting.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.setting.sub_key</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord, java.lang.Integer> SUB_KEY = createField("sub_key", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>dstack.setting.value</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * Create a <code>dstack.setting</code> table reference
	 */
	public Setting() {
		super("setting", io.github.ibuildthecloud.dstack.db.jooq.generated.Dstack.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.setting</code> table reference
	 */
	public Setting(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.db.jooq.generated.Dstack.DSTACK, io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Setting.SETTING);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.IDENTITY_SETTING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.KEY_SETTING_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.SettingRecord>>asList(io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.KEY_SETTING_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Setting as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.db.jooq.generated.tables.Setting(alias);
	}
}